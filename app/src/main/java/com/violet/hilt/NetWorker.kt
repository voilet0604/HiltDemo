package com.violet.hilt

import android.content.Context
import android.util.Log
import androidx.work.Worker
import androidx.work.WorkerParameters

class NetWorker(appContext: Context, params: WorkerParameters): Worker(appContext, params) {
    override fun doWork(): Result {
        Log.e("NetWorker", "doWork")
        return Result.success()
    }
}