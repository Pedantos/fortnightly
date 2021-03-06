package dev.olog.fortnightly.app

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import dev.olog.fortnightly.data.di.DataModule
import dev.olog.fortnightly.data.di.NetworkModule
import dev.olog.fortnightly.presentation.main.di.MainActivityInjector
import dev.olog.fortnightly.presentation.viewmodel.ViewModelModule
import javax.inject.Singleton


@Component(
    modules = [
        AndroidInjectionModule::class,
        AppModule::class,

        ViewModelModule::class,
        MainActivityInjector::class,

        NetworkModule::class,
        DataModule::class
    ]
)
@Singleton
interface AppComponent : AndroidInjector<App> {

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance instance: Application): AppComponent
    }

}

