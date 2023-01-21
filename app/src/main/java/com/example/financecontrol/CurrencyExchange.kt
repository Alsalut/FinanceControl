package com.example.financecontrol

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.currency_exchange.*

class CurrencyExchange : AppCompatActivity()
{
    var flag = true

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.currency_exchange)

        etListener()
    }

    private fun etListener()
    {
        et_currency_2.addTextChangedListener(object : TextWatcher
        {
            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int)
            {
            }

            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int)
            {
            }

            override fun afterTextChanged(s: Editable)
            {
                if (flag)
                {
                    flag = false
                    et_currency_1.setText(et_currency_2.text.toString())
                } else flag = true
            }
        })

        et_currency_1.addTextChangedListener(object : TextWatcher
        {
            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int)
            {
            }

            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int)
            {
            }

            override fun afterTextChanged(s: Editable)
            {
                if (flag)
                {
                    flag = false
                    et_currency_2.setText(et_currency_1.text.toString())
                } else flag = true
            }
        })
    }
}