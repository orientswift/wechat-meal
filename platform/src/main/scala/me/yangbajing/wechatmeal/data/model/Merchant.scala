package me.yangbajing.wechatmeal.data.model

import java.time.ZonedDateTime

/**
 * 商户
 * Created by Yang Jing (yangbajing@gmail.com) on 2015-08-18.
 */
case class Merchant(id: Int,
                    name: String,
                    address: String,
                    remark: Option[String],
                    createdAt: ZonedDateTime)
