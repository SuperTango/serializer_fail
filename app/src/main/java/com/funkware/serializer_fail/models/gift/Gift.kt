//@file:UseSerializers(UriSerializer::class)

package com.funkware.serializer_fail.models.chat

import android.net.Uri
import com.funkware.serializer_fail.models.user.DetailUserInfo
import io.realm.RealmObject
import io.realm.RealmResults
import io.realm.annotations.LinkingObjects
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.Transient

@Serializable
open class Gift() : RealmObject() {
    @SerialName("animation_url")
    var animationUrl: String? = null

    @SerialName("gift_id")
    var giftId: String = ""

    @SerialName("image_url")
    private var _imageUrl: String? = null

    val imageUrl: Uri?
        get() {
            if (_imageUrl == null) {
                return null
            }
            try {
                return Uri.parse(_imageUrl)
            } catch (e: Exception) {
                return null
            }
        }

    var name: String = ""

    @Transient
    @LinkingObjects("displayGiftsGiven")
    private val parentdisplayGiftsGiven: RealmResults<DetailUserInfo>? = null

    @Transient
    @LinkingObjects("displayGiftsReceived")
    private val parentdisplayGiftsReceived: RealmResults<DetailUserInfo>? = null
}