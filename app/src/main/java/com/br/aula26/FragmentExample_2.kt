package com.br.aula26

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class FragmentExample_2: Fragment() {
//    FragmentExample extende de Fragment

//    A primeira coisa a ser feita para criar um fragment é sobrescrever a função 'onCreateView'

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

//        O retorno é sobrescrito como escrito abaixo, em que o método inflate é responsável por 'inflar' o fragment
        return inflater.inflate(R.layout.fragment_example_2, container, false)
//        O padrão de 'attachToRoot' é ser sempre 'false'
    }
}