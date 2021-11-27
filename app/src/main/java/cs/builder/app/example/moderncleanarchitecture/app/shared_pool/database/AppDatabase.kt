package cs.builder.app.example.moderncleanarchitecture.app.shared_pool.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [], version = 1)
abstract class AppDatabase : RoomDatabase() {

    companion object {

        private const val NAME: String = "app-database"

        /** */
        fun getInstance(context: Context): AppDatabase =
            Room.databaseBuilder(context, AppDatabase::class.java, NAME).build()

    }

}