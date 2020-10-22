package com.sanardev.instagramapijava.utils

import java.util.*

class Utilities{
    companion object{
        @JvmStatic
        fun getTimeZoneOffset(): Int {
            val mCalendar: Calendar = GregorianCalendar()
            val mTimeZone = mCalendar.timeZone
            return mTimeZone.getOffset(Date().time) / 1000 / 60
        }
    }
}