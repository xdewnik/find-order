package com.kulya.dev.findorder.data

import java.io.Serializable

data class Order(val goodsList: MutableList<Good>, val orderId:String, val client:Client, val total:String): Serializable