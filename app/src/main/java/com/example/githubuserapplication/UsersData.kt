package com.example.githubuserapplication

object UsersData {
    private val names = arrayOf(
        "Albertus Angga Raharja",
        "Andres Vidoza",
        "Dani Ihza Farrosi",
        "Alexius Adhitya K",
        "Dery Rahman Ahaddienata",
        "Muhammad Fadhlan",
        "Fanny Hasbi",
        "Firhan Mahdi Ramadhani",
        "Muh Isfhani Ghiath",
        "Zul Faza Makarima"
    )

    private val usernames = arrayOf(
        "albertusdev",
        "andresvidoza",
        "danivideda",
        "debugvelop",
        "deryrahman",
        "fadhln",
        "fannyhasbi",
        "fearhunt",
        "isfaaghyth",
        "zulfaza"
    )

    private val profilePictures = intArrayOf(
        R.drawable.albertusdev,
        R.drawable.andresvidoza,
        R.drawable.danivideda,
        R.drawable.debugvelop,
        R.drawable.deryrahman,
        R.drawable.fadhln,
        R.drawable.fannyhasbi,
        R.drawable.fearhunt,
        R.drawable.isfaaghyth,
        R.drawable.zulfaza
    )

    private val repo = intArrayOf(
        35,
        2,
        45,
        29,
        45,
        4,
        80,
        33,
        325,
        11,
    )

    private val followers = intArrayOf(
        178,
        525,
        27,
        14,
        41,
        4,
        99,
        26,
        613,
        13,
    )

    private val following = intArrayOf(
        126,
        2,
        42,
        2,
        13,
        3,
        41,
        12,
        177,
        12,
    )

    private val company = arrayOf(
        "Universitas Indonesia",
        "Tech Youtuber",
        "PT Vortex Edumedia",
        "Universitas Gadjah Mada",
        "GOJEK",
        "Universitas Gadjah Mada",
        "JAKPAT",
        "N20 Lab",
        "Tokopedia",
        "OmahTI UGM",
    )

    private val location = arrayOf(
        "Depok, Jawa Barat, Indonesia",
        "Montreal, Canada",
        "Yogyakarta, Indonesia",
        "Yogyakarta, Indonesia",
        "Jakarta, Indonesia",
        "Yogyakarta, Indonesia",
        "Yogyakarta, Indonesia",
        "Yogyakarta, Indonesia",
        "Jakarta, Indonesia",
        "Yogyakarta, Indonesia",
    )

    val listData: ArrayList<User>
        get() {
            val list = arrayListOf<User>()
            for (position in names.indices) {
                val user = User(
                    names[position],
                    usernames[position],
                    profilePictures[position],
                    repo[position],
                    followers[position],
                    following[position],
                    company[position],
                    location[position],
                )
                list.add(user)
            }
            return list
        }
}