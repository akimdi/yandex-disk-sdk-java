/*
 * Лицензионное соглашение на использование набора средств разработки
 * «SDK Яндекс.Диска» доступно по адресу: http://legal.yandex.ru/sdk_agreement
 *
 */

package com.yandex.disk.client;

import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.AbstractHttpEntity;

public abstract class ListParsingHandler {

    public void onCreateRequest(HttpPost post, AbstractHttpEntity entity) {
        post.setEntity(entity);
    }

    public void onPageFinished(int itemsOnPage) {
    }

    public boolean hasCancelled() {
        return false;
    }

    public abstract boolean handleItem(ListItem item);
}
