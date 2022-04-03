package com.icloud.chain_of_responsibilities.review

import com.icloud.chain_of_responsibilities.before.Request

class LoggingRequestHandler(nextHandler: RequestHandler?) : RequestHandler(nextHandler) {
    override fun handle(request: Request) {
        println("로깅")
        super.handle(request)
    }
}