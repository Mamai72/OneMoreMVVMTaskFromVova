package com.ib.onemoremvvmtaskfromvova

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ib.onemoremvvmtaskfromvova.network.model.RepositoryItem
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class DataModel : ViewModel() {

    val kids = MutableLiveData<List<RepositoryItem>>()

    fun getKids() {
        CoroutineScope(Dispatchers.IO).launch {
            val result = MyRetrofit.apiService.getInfo()
            kids.value = result
        }

    }
}

