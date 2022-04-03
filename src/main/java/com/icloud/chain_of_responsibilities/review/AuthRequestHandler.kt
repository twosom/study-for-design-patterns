package com.icloud.chain_of_responsibilities.review

import com.icloud.chain_of_responsibilities.before.Request

class AuthRequestHandler(nextHandler: RequestHandler?) : RequestHandler(nextHandler) {

    override fun handle(request: Request) {
        println("인증이 되었는가?")
        super.handle(request)
    }
}