package com.example.project_foldablephone

class FoldablePhone(isScreenLightOn: Boolean = false) : Phone(isScreenLightOn) {
    //Indicar si telefono esta plegado
    var isFoldable: Boolean = false

    //Método que cambia comportamiento de método switchOn de clase Phone
    override fun switchOn() {
        if (!isFoldable) {
            isScreenLightOn = true
        }
    }

    //Método para cambiar el estado de plegado
    fun abir() {
        isFoldable = true
    }
    fun cerrar(){
        isFoldable = false
    }
}

