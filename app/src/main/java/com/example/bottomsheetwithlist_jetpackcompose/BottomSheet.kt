package com.example.bottomsheetwithlist_jetpackcompose

import android.widget.Toast
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.ModalBottomSheetLayout
import androidx.compose.material.ModalBottomSheetValue
import androidx.compose.material.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp


@OptIn(ExperimentalMaterialApi::class)
@Composable
fun BottomSheet() {
    val context = LocalContext.current
    val scope = rememberCoroutineScope()
    val bottomSheetState =
        rememberModalBottomSheetState(initialValue = ModalBottomSheetValue.Hidden)

    ModalBottomSheetLayout(
        sheetState = bottomSheetState,
        sheetContent = {
            Column(modifier = Modifier.padding(12.dp)) {
                ListItemData(title = "List item 1", onItemClick = {
                    Toast.makeText(context, it, Toast.LENGTH_SHORT).show()
                })
                ListItemData(title = "List item 2", onItemClick = {
                    Toast.makeText(context, it, Toast.LENGTH_SHORT).show()
                })
                ListItemData(title = "List item 3", onItemClick = {
                    Toast.makeText(context, it, Toast.LENGTH_SHORT).show()
                })
                ListItemData(title = "List item 4", onItemClick = {
                    Toast.makeText(context, it, Toast.LENGTH_SHORT).show()
                })
                ListItemData(title = "List item 5", onItemClick = {
                    Toast.makeText(context, it, Toast.LENGTH_SHORT).show()
                })
                ListItemData(title = "List item 6", onItemClick = {
                    Toast.makeText(context, it, Toast.LENGTH_SHORT).show()
                })
            }

        },
        sheetShape = RoundedCornerShape(topStart = 8.dp, topEnd = 8.dp),
        sheetElevation = 8.dp
    ) {
        MainPageContent(scope, bottomSheetState)
    }
}
