package ru.techmas.barrier.interfaces.views

import ru.techmas.barrier.interfaces.utils_view.NavigatorActivityView


interface SettingsView : BaseView, NavigatorActivityView {
    fun showStub()
    fun setHand(hand: Boolean)
}
