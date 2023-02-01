package com.example.appcdab2

import android.os.Parcel
import android.os.Parcelable

data class Profile(var name: String? , var age : Int?) : Parcelable {

    // Parcel va lire tout les types primitifs
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readValue(Int::class.java.classLoader) as? Int
    ) {
    }


    // override converti mon objet en parcelable
    // important de respecter l'ordre
    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(name)
        parcel.writeValue(age)
    }

    override fun describeContents(): Int {
        return 0
    }

    //permet de creer des utilisateur via mon objet
    companion object CREATOR : Parcelable.Creator<Profile> {
        override fun createFromParcel(parcel: Parcel): Profile {
            return Profile(parcel)
        }

        // permets de creer une liste d'utilisateurs via un objet
        override fun newArray(size: Int): Array<Profile?> {
            return arrayOfNulls(size)
        }
    }

}
