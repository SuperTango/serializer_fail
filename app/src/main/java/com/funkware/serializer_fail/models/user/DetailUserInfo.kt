package com.funkware.serializer_fail.models.user

import com.funkware.serializer_fail.models.chat.Gift
import com.funkware.serializer_fail.utils.jsonserializers.RealmListSerializerForGift
import io.realm.RealmList
import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
open class DetailUserInfo() : RealmObject() {
    @PrimaryKey
    @SerialName("user_id")
    public open var userId: String = ""

    @SerialName("display_gifts_given")
    @Serializable(with = RealmListSerializerForGift::class)
    var displayGiftsGiven: RealmList<Gift?>? = null

    @SerialName("display_gifts_received")
    @Serializable(with = RealmListSerializerForGift::class)
    var displayGiftsReceived: RealmList<Gift?>? = null
}