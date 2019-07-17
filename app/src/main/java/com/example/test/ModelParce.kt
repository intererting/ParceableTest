package com.example.test

import android.os.Parcel
import android.os.Parcelable

class ModelA(var name: String?) : Parcelable {
    constructor(parcel: Parcel) : this(parcel.readString()) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(name)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<ModelA> {
        override fun createFromParcel(parcel: Parcel): ModelA {
            return ModelA(parcel)
        }

        override fun newArray(size: Int): Array<ModelA?> {
            return arrayOfNulls(size)
        }
    }
}

class ModelB(var modelA: List<ModelA>?) : Parcelable {

    constructor(parcel: Parcel) : this(parcel.createTypedArrayList(ModelA)) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeTypedList(modelA)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<ModelB> {
        override fun createFromParcel(parcel: Parcel): ModelB {
            return ModelB(parcel)
        }

        override fun newArray(size: Int): Array<ModelB?> {
            return arrayOfNulls(size)
        }
    }

}