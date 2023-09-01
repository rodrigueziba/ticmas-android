package com.example.ticmas
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private val _result = MutableLiveData<String>()
    val result: LiveData<String> = _result

    fun compareTextos(textoModel: TextoModel) {
        val resultText = if (textoModel.texto1 == textoModel.texto2) "Iguales" else "Diferentes"
        _result.value = resultText
    }
}
