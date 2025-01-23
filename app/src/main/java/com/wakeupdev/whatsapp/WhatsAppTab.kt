package com.wakeupdev.whatsapp

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.wakeupdev.whatsapp.calls.CallsScreen
import com.wakeupdev.whatsapp.chats.ChatsScreen
import com.wakeupdev.whatsapp.statuses.StatusScreen
import com.wakeupdev.whatsapp.ui.theme.WhatsAppTheme
import kotlinx.coroutines.launch

@Composable
fun WhatsAppTab(modifier: Modifier = Modifier) {
    val tabs = listOf("Chats", "Status", "Calls")

    val pagerState = rememberPagerState(
        initialPage = 0,
        pageCount = { tabs.size }
    )

    val coroutineScope = rememberCoroutineScope()

    Column {
        TabRow(
            selectedTabIndex = pagerState.currentPage,
            modifier = Modifier.fillMaxWidth()
        ) {
            tabs.forEachIndexed { index, title ->
                Tab(
                    text = { Text(title) },
                    selected = pagerState.currentPage == index,
                    onClick = { coroutineScope.launch { pagerState.animateScrollToPage(index) } }
                )
            }
        }

        HorizontalPager(
            state = pagerState,
            modifier = Modifier.fillMaxSize(),
        ) {
            page ->  when(page){
                0 -> ChatsScreen()
                1 -> CallsScreen()
                2 -> StatusScreen()
            }
        }
    }
}

@Preview
@Composable
private fun WhatsAppTabPrev() {
    WhatsAppTheme {
        WhatsAppTab()
    }
}