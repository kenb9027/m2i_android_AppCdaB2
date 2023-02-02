package com.example.appcdab2

import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.DialogFragment

class ConfirmDeleteDialogFragment  : DialogFragment() {

    //creation interface de recuperation des clicks
    interface ConfirmDeleteListener {
        fun onDialogPositiveClick()
        fun onDialogNegativeClick()
    }

    var listener: ConfirmDeleteListener? = null

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        //On utilise le design pattern builder
        return super.onCreateDialog(savedInstanceState)
    }
}