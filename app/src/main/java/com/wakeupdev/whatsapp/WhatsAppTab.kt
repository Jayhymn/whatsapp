package com.wakeupdev.whatsapp

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.wakeupdev.whatsapp.calls.ui.CallsScreen
import com.wakeupdev.whatsapp.chats.data.dummy
import com.wakeupdev.whatsapp.chats.ui.ChatsScreen
import com.wakeupdev.whatsapp.statuses.StatusScreen
import com.wakeupdev.whatsapp.ui.theme.WhatsAppTheme
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun WhatsAppTab(modifier: Modifier = Modifier) {
    val tabs = listOf("Chats", "Status", "Calls")

    val pagerState = rememberPagerState(
        initialPage = 0,
        pageCount = { tabs.size }
    )

    val coroutineScope = rememberCoroutineScope()

    Scaffold(
        containerColor = Color.White,
        topBar = {
            TopAppBar(title = {
                Text(
                    "WhatsApp",
                    style = MaterialTheme.typography.titleLarge.copy(fontWeight = FontWeight.Bold)
                )
            })
        },
    ) { innerPadding ->
        Column {
            TabRow(
                selectedTabIndex = pagerState.currentPage,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(innerPadding)
            ) {
                tabs.forEachIndexed { index, title ->
                    Tab(
                        text = { Text(title.uppercase()) },
                        unselectedContentColor = Color.Gray,
                        selected = pagerState.currentPage == index,
                        onClick = { coroutineScope.launch { pagerState.animateScrollToPage(index) } }
                    )
                }
            }

            HorizontalPager(
                state = pagerState,
                modifier = Modifier.fillMaxSize(),
            ) { page ->
                when (page) {
                    0 -> ChatsScreen(threads = dummy.sampleThreads)
                    1 -> CallsScreen()
                    2 -> StatusScreen()
                }
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