package com.example.project_foldablephone

open class Phone(var isScreenLightOn: Boolean = false) {
    //Encender telefono
    fun switchOn() {
        //Pantalla encendida
        isScreenLightOn = true
    }
    //Apagar telefono
    fun switchOff() {
        //Pantalla apgada
        isScreenLightOn = false
    }

    fun checkPhoneScreenLight() {
        val phoneScreenLight = if (isScreenLightOn) "on" else "off"
        println("The phone screen's light is $phoneScreenLight.")
    }
}

