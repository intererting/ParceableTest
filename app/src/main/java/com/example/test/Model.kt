package com.example.test

import android.os.Parcel
import android.os.Parcelable
import kotlinx.android.parcel.Parceler
import kotlinx.android.parcel.Parcelize

@Parcelize
open class Father(
    var name: String? = ""
) : Parcelable {
//    constructor(parcel: Parcel) : this(parcel.readString()) {
//    }
//
//    override fun writeToParcel(parcel: Parcel, flags: Int) {
//        parcel.writeString(name)
//    }
//
//    override fun describeContents(): Int {
//        return 0
//    }
//
//    companion object CREATOR : Parcelable.Creator<Father> {
//        override fun createFromParcel(parcel: Parcel): Father {
//            return Father(parcel)
//        }
//
//        override fun newArray(size: Int): Array<Father?> {
//            return arrayOfNulls(size)
//        }
//    }
}

@Parcelize
class Son(var age: Int) : Father() {

    companion object : Parceler<Son> {
        override fun create(parcel: Parcel): Son {
            return Son(parcel.readInt()).apply {
                name = parcel.readString()
            }
        }

        override fun Son.write(parcel: Parcel, flags: Int) {
            parcel.writeInt(age)
            parcel.writeString(name)
        }
    }

//    constructor(parcel: Parcel) : this(parcel.readInt()) {
//        name = parcel.readString().toString()
//    }
//

//    override fun writeToParcel(parcel: Parcel, flags: Int) {
//        parcel.writeInt(age)
//        super.writeToParcel(parcel, flags)
//    }
//
//    companion object CREATOR : Parcelable.Creator<Son> {
//        override fun createFromParcel(parcel: Parcel): Son {
//            return Son(parcel)
//        }
//
//        override fun newArray(size: Int): Array<Son?> {
//            return arrayOfNulls(size)
//        }
//    }
//
//    override fun describeContents(): Int {
//        return 0
//    }

}