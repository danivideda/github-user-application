package com.example.githubuserapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.githubuserapplication.databinding.ActivityUserDetailBinding

class UserDetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityUserDetailBinding

    companion object {
        const val EXTRA_USER = "extra_user"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUserDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val user = intent.getParcelableExtra<User>(EXTRA_USER) as User
        user.profilePicture?.let { binding.imgProfilePicture.setImageResource(it) }

        binding.tvName.text = user.name
        binding.tvUsername.text = user.username
        binding.tvRepo.text = user.repo.toString()
        binding.tvFollower.text = user.follower.toString()
        binding.tvFollowing.text = user.following.toString()
        binding.tvCompany.text = user.company
        binding.tvLocation.text = user.location
    }
}