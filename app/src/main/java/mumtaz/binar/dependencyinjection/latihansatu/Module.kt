package mumtaz.binar.dependencyinjection.latihansatu

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object Module {
    @Singleton
    @Provides
    fun konversihitung() : KonversiNilai{
        return KonversiNilai()
    }
}