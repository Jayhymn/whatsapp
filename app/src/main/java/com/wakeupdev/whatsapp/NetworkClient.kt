package com.wakeupdev.whatsapp

import io.ktor.client.HttpClient
import io.ktor.client.engine.cio.CIO
import io.ktor.client.plugins.DefaultRequest
import io.ktor.client.plugins.HttpTimeout
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.logging.LogLevel
import io.ktor.client.plugins.logging.Logging
import io.ktor.client.request.header
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json
import java.io.File
import java.security.KeyStore
import javax.net.ssl.TrustManagerFactory

object NetworkClient {

    private val certificateFile = File("src/main/resources/certificate.pem") // Adjust path
    private val certificate = certificateFile.inputStream()

    private val keyStore: KeyStore = KeyStore.getInstance(KeyStore.getDefaultType()).apply {
        load(null, null)
        setCertificateEntry("alias", java.security.cert.CertificateFactory.getInstance("X.509").generateCertificate(certificate))
    }

    private val trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm()).apply {
        init(keyStore)
    }

    val httpClient = HttpClient(CIO) {
//        engine {
//            https {
//                SSLContext.getInstance("TLS").apply {
//                    init(null, trustManagerFactory.trustManagers, null)
//                }
//            }
//        }

        install(DefaultRequest) {
            header("Accept", "application/json")
        }
        install(HttpTimeout) {
            requestTimeoutMillis = 30_000
        }
        install(ContentNegotiation) {
            json(
                Json {
                    prettyPrint = true
                    isLenient = true
                    ignoreUnknownKeys = true
                }
            )
        }
        install(Logging) {
            level = LogLevel.ALL
        }
    }
}
