package com.example.chitchat.presentation.chat.chatrow.chatbubble

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun RecipientName(
    modifier: Modifier = Modifier,
    name: String,
    isName: Boolean = true,
    altName: String? = null,
    color: Color =MaterialTheme.colorScheme.onSecondary,
    onClick: ((String) -> Unit)? = null
) {
    Row(
        modifier = modifier
            .clickable {
                onClick?.invoke(name)
            }
            .padding(start = 4.dp, top = 2.dp, end = 8.dp),
        verticalAlignment = Alignment.Top
    ) {
        Text(
            modifier = Modifier.padding(horizontal = 6.dp, vertical = 2.dp),
            text = name,
            color = color,
//            fontSize = 15.sp,
            style = MaterialTheme.typography.bodyLarge,
            maxLines = 1,
//            letterSpacing = 1.sp,
            fontWeight = FontWeight.Bold,
            overflow = TextOverflow.Ellipsis
        )
        if (!isName && altName != null) {
            Text(
                modifier = Modifier.padding(vertical = 4.dp),
                text = "~$altName",
                fontSize = 12.sp,
            )
        }
    }
}