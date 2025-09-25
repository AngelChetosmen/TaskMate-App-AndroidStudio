package com.example.to_dolist.data.room

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface TaskHistoryDao {

    @Query("SELECT * FROM task_history_table")
    fun getAllTasksHistory(): LiveData<List<TaskHistory>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addTaskHistory(taskHistory: TaskHistory)

    @Query("DELETE FROM task_history_table")
    suspend fun deleteAllTasksHistory(): Int
}