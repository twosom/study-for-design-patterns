package com.icloud.chain_of_responsibilities.review

import com.icloud.chain_of_responsibilities.before.Request

class PrintRequestHandler(nextHandler: RequestHandler?) : RequestHandler(nextHandler) {

    override fun handle(request: Request) {
        println(request.body)
        super.handle(request)
    }
}