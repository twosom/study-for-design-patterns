package com.icloud.chain_of_responsibilities.review

import com.icloud.chain_of_responsibilities.before.Request

abstract class RequestHandler(var nextHandler: RequestHandler?) {

    open fun handle(request: Request) {
        nextHandler?.handle(request)

    }
}