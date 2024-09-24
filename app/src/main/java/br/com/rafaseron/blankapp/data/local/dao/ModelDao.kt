package br.com.rafaseron.blankapp.data.local.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import br.com.rafaseron.blankapp.data.local.entities.ModelEntity

@Dao
interface ModelDao {
    @Insert
    fun insertModel(model: ModelEntity)

    @Delete
    fun deleteModel(model: ModelEntity)

    @Update
    fun updateModel(modelEntity: ModelEntity)

    @Query("SELECT * FROM ModelEntity")
    fun getAll(): List<ModelEntity>

    @Query("SELECT * FROM ModelEntity WHERE id=:id")
    fun searchModelFromId(id: Int): ModelEntity

}