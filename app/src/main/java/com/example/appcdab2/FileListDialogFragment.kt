package com.example.appcdab2

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.DialogFragment

class FileListDialogFragment : DialogFragment() {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val builder = AlertDialog.Builder(activity)
        val inflater = activity?.layoutInflater

        //builder va chermer ma dialog_file_list
        if (inflater != null) {
            builder.setView(inflater.inflate(R.layout.dialog_file_list, null))
        }

//        return super.onCreateDialog(savedInstanceState)
        return builder.create()
    }
}