package br.com.tmara.placapp.extensions

import android.widget.EditText

fun EditText.value() = this.text.toString()