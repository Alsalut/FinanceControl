package com.example.financecontrol

import android.util.Log
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase //import com.google.firebase.database.DatabaseReference //import com.google.firebase.database.FirebaseDatabase
import java.text.DecimalFormat
import java.text.ParseException

// init constants
const val history = "history"
var historyFromFirebase = ""
const val historyShort = "historyShort"
var flag = false
const val key = "key"
const val newLine = "\n"
const val zero = "0"
const val empty = ""
const val all = "all"
const val card = "card"
const val cash = "cash"
const val safe = "safe"
const val toCard = "На карту"
const val toCash = "В наличные"
const val fromCard = "С карты"
const val fromCash = "Из наличных"
const val fromCashToSafe = "Из наличных в Запас"
const val fromSafeToCash = "Из запаса в наличные"
const val fromCardToCash = "С карты в наличные"
const val fromCashToCard = "Из наличных на карту"
const val noResult = "Совпадений нет."

// init Firebase
val firebase: FirebaseDatabase = FirebaseDatabase.getInstance()

// init Firebase reference
val refHistory: DatabaseReference by lazy { firebase.getReference(history) }
val refHistoryShort: DatabaseReference by lazy { firebase.getReference(historyShort) }

interface IConstant
{
    // преобразование String в double
    fun stringToDouble(text: String?): Double
    {
        var num = 0.0
        try
        {
            num = roundTwoDigit.parse(text).toDouble()
        } catch (e: ParseException)
        {
            Log.d(myLog, e.message!!)
        }
        return num
    }

    // сохраняем изменения в Firebase
    fun writeToFirebase(stringNewHistory: String?)
    { //        refHistory.setValue(stringNewHistory)
    }

    companion object
    {
        // Tag Log
        const val myLog = "myLog"

        // формат показа даты
        const val timePattern = "dd.MMM.yyyy HH:mm:ss"

        // имя локальной базы данных
        const val myLocalBase = "myLocalBase"
        const val historyLocalBase = "historyLocalBase"
        const val backupLocalBase = "backupLocalBase"
        const val FILE_NAME = "content.txt"

        // split constants
        const val splitHistory = "&splitHistory&"
        const val splitElement = "\n" // "&splitElement&";

        // округление double до 2-х знаков после запятой
        val roundTwoDigit = DecimalFormat("0.00")
    }
}
