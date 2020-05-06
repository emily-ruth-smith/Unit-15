package com.raywenderlich.spacedaily

import com.raywenderlich.spacedaily.GlideApp.get
import com.raywenderlich.spacedaily.network.NASAAPIInterface
import com.raywenderlich.spacedaily.network.networkModule
import com.squareup.moshi.Moshi
import junit.framework.Assert.assertNotNull
import junit.framework.Assert.assertTrue
import net.bytebuddy.matcher.ElementMatchers.named
import okhttp3.OkHttpClient
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.koin.core.context.startKoin
import org.koin.core.context.stopKoin
import org.koin.core.get
import org.koin.test.KoinTest
import org.koin.test.get
import org.koin.test.inject
import retrofit2.Retrofit

/*class NetworkTest: KoinTest {
    val api: NASAAPIInterface by inject()
    val moshi: Moshi by inject()
    val retrofit: Retrofit by inject()
    val okHttpClient: OkHttpClient by inject()
    val baseUrl: String by lazy { GlideApp.get(named("BASE_URL")) as String}

    @Before
    fun setup() {
        startKoin {
            modules(listOf(networkModule))
        }
    }

    @After
    fun tearDown() {
        stopKoin()
    }

    @Test
    fun `Test Retrofit Created`() {
        assertNotNull(retrofit)
        assert(baseUrl == "https://api.nasa.gov/planetary")
    }

    @Test
    fun `Test Moshi Created`() {
        assertNotNull(moshi)
    }

    @Test
    fun `Test API Created`() {
        assertNotNull(api)
    }

    @Test
    fun `Test OkHttp`() {
        assertNotNull(okHttpClient)
        assertTrue(okHttpClient.connectTimeoutMillis == 30000)
        assertTrue(okHttpClient.writeTimeoutMillis == 30000)
        assertTrue(okHttpClient.readTimeoutMillis == 30000)
        assertTrue(okHttpClient.interceptors.size == 1)
    }
}*/