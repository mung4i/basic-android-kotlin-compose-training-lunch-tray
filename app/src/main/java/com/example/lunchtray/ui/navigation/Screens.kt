package com.example.lunchtray.ui.navigation

import com.example.lunchtray.R
import androidx.annotation.StringRes

enum class Screens(@StringRes val title: Int) {
    Start(R.string.start),
    Entree(R.string.entree),
    Side(R.string.side_dish),
    Accompaniment(R.string.accompaniment),
    Checkout(R.string.checkout)
}