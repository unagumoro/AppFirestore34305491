package br.edu.up.rgm34305491.viewmodel

import androidx.lifecycle.ViewModel
import br.edu.up.rgm34305491.Filters

/**
 * ViewModel for [br.edu.up.rgm34305491.MainActivity].
 */

class MainActivityViewModel : ViewModel() {

    var isSigningIn: Boolean = false
    var filters: Filters = Filters.default
}
