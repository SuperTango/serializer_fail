//@file:UseSerializers(LenientDateSerializer::class)
package com.funkware.serializer_fail.models.user

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
open class GeneralUserInfo() : RealmObject() {
    @SerialName("id")
    @PrimaryKey
    open var userId: String = ""

    var name: String? = null
}