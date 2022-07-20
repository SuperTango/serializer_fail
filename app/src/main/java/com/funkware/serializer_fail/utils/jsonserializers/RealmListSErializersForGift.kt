package com.funkware.serializer_fail.utils.jsonserializers

import com.funkware.serializer_fail.models.chat.Gift
import io.realm.RealmList
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.KSerializer
import kotlinx.serialization.builtins.ListSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

class RealmCollectionsSerializers {
}

//class MyRealmListSerializer<T>(val elementSerializer: KSerializer<T>): KSerializer<RealmList<T>> {
//    override fun serialize(encoder: Encoder, value: RealmList<T>) {
//        encoder.encodeSerializableValue(ListSerializer(elementSerializer), value.toList())
//    }
//
//    override fun deserialize(decoder: Decoder): RealmList<T> {
//        val list = decoder.decodeSerializableValue(ListSerializer(elementSerializer))
//        val realmList: RealmList<T> = RealmList()
//        realmList.addAll(list)
//        return realmList
//    }
//
//    override val descriptor: SerialDescriptor = SerialDescriptor("RealmList", ListSerializer(elementSerializer).descriptor)
//
//}

// Workaround for kapt compiler bug.  See https://github.com/Kotlin/kotlinx.serialization/issues/685
class RealmListSerializerForGift(serializer: KSerializer<Gift>): RealmListSerializer<Gift>(serializer)

open class RealmListSerializer<T>(private val elementSerializer: KSerializer<T>) : KSerializer<RealmList<T>> {
    private val listSerializer = ListSerializer(elementSerializer)

    @OptIn(ExperimentalSerializationApi::class)
    override val descriptor: SerialDescriptor = SerialDescriptor("RealmList", ListSerializer(elementSerializer).descriptor)

    override fun serialize(encoder: Encoder, value: RealmList<T>) {
        listSerializer.serialize(encoder, value)
    }

    override fun deserialize(decoder: Decoder): RealmList<T> {
        val list = decoder.decodeSerializableValue(ListSerializer(elementSerializer))
        val realmList: RealmList<T> = RealmList()
        realmList.addAll(list)
        return realmList
    }
}
