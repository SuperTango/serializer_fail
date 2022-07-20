package com.funkware.serializer_fail.models.user

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
open class FullUser() : RealmObject() {
    @SerialName("id")
    @PrimaryKey
    open var userId: String = ""

    @SerialName("general_info")
    var generalInfo: GeneralUserInfo? = null

    @SerialName("detail_info")
    var detailInfo: DetailUserInfo? = null
}