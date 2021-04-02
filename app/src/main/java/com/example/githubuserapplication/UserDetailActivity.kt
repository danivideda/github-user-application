package com.example.githubuserapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.example.githubuserapplication.databinding.ActivityUserDetailBinding

class UserDetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityUserDetailBinding
    private lateinit var user: User

    companion object {
        const val EXTRA_USER = "extra_user"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUserDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        user = intent.getParcelableExtra<User>(EXTRA_USER) as User

        supportActionBar?.apply {
            title = "${user.username}\'s profile"
            // show back button on toolbar
            setDisplayHomeAsUpEnabled(true)
        }

        user.profilePicture?.let { binding.imgProfilePicture.setImageResource(it) }
        binding.tvName.text = user.name
        binding.tvUsername.text = user.username
        binding.tvRepo.text = user.repo.toString()
        binding.tvFollower.text = user.follower.toString()
        binding.tvFollowing.text = user.following.toString()
        binding.tvCompany.text = user.company
        binding.tvLocation.text = user.location
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.action_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.share -> {
                val shareIntent: Intent = Intent().apply {
                    action = Intent.ACTION_SEND
                    putExtra(Intent.EXTRA_TEXT, "https://github.com/${user.username}")
                    type = "text/plain"
                }
                startActivity(Intent.createChooser(shareIntent, "Share Github profile link"))
            }
        }
        return super.onOptionsItemSelected(item)
    }
}