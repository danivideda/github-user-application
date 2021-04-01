package com.example.githubuserapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.githubuserapplication.databinding.ItemUserBinding

class ListUserAdapter(val listUser: ArrayList<User>) : RecyclerView.Adapter<ListUserAdapter.ListViewHolder>() {
    class ListViewHolder(val binding: ItemUserBinding) : RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ListUserAdapter.ListViewHolder {

        val binding = ItemUserBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ListUserAdapter.ListViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ListUserAdapter.ListViewHolder, position: Int) {
        val user = listUser[position] as User

        Glide.with(holder.itemView.context)
            .load(user.profilePicture)
            .into(holder.binding.imgProfilePicture)

        holder.binding.tvName.text = user.name
        holder.binding.tvUsername.text = "@${user.username}"
        holder.binding.tvCompany.text = user.company
        holder.binding.tvRepoCount.text = "Repository: ${user.repo}"
    }

    override fun getItemCount(): Int {
        return listUser.size
    }

}