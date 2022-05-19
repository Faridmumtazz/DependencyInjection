package mumtaz.binar.dependencyinjection

import androidx.core.app.ActivityCompat
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun namaMurid(): Student{
        return Student()

    }
    @Singleton
    @Provides
    fun konversihitung() :Nilai{
        return Nilai()
    }


    @Singleton
    @Provides
    fun guru():String{
        return "Adinda"
    }
}