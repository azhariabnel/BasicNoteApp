package com.ari.basicnoteapp.util

import androidx.room.TypeConverter
import java.util.*

class DateConverter {
    @TypeConverter
    fun timeStampFromDate(date: Date): Long{
        return date.time
    }

    @TypeConverter
    fun dateFromTimeStamp(timpeStamp: Long): Date?{
        return Date(timpeStamp)
    }

    
}