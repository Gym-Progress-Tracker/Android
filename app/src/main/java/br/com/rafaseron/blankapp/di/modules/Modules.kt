package br.com.rafaseron.blankapp.di.modules

import android.content.Context
import androidx.room.Room
import br.com.rafaseron.blankapp.data.local.dao.ModelDao
import br.com.rafaseron.blankapp.data.local.database.AppDatabase
import br.com.rafaseron.blankapp.data.repository.ModelRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class Modules {
    @Provides
    @Singleton
    fun provideDatabase(@ApplicationContext context: Context): AppDatabase{
        return Room.databaseBuilder(
            context = context, AppDatabase::class.java,
            name = "AppDatabase.db"
        ).build()
    }

    @Provides
    fun provideDao(db: AppDatabase): ModelDao{
        return db.modelDao()
    }

    @Provides
    fun provideRepository(db: AppDatabase): ModelRepository{
        return ModelRepository(db)
    }


}