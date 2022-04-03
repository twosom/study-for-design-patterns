package com.icloud.chain_of_responsibilities.review

import com.icloud.chain_of_responsibilities.before.Request

class Client(private val requestHandler: RequestHandler) {
    fun doWork() {
        val request: Request = Request("이번 놀이는 뽑기!")
        this.requestHandler.handle(request)
    }
}


fun main() {
    val chain: RequestHandler = AuthRequestHandler(LoggingRequestHandler(PrintRequestHandler(null)))
    val client = Client(chain)
    client.doWork()
}