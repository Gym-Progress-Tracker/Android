package br.com.rafaseron.blankapp.data.repository

import br.com.rafaseron.blankapp.data.local.database.AppDatabase
import br.com.rafaseron.blankapp.data.local.entities.ModelEntity

class ModelRepository(db:AppDatabase) {
    private val modelDao = db.modelDao()

    fun getAll(): List<ModelEntity>{
        return modelDao.getAll()
    }

    //CAMADA ONLINE

    //CAMADA MISTA (ONLINE + OFFLINE)

    //CAMADA OFFLINE
}