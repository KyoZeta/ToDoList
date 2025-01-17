package com.redb.to_dolist.DB.DAOs

import androidx.room.Dao
import androidx.room.Query
import com.redb.to_dolist.DB.Entidades.AplicacionEntity

@Dao
interface AplicacionDao {

    @Query("SELECT * FROM Aplicacion")
    fun getAll():List<AplicacionEntity>
}