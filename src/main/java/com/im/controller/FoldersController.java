package com.im.controller;

import com.im.api.*;
import com.im.lib.annotation.WebsocketHandler;
import com.im.lib.annotation.WebsocketHandlerMapping;

@WebsocketHandler
public class FoldersController {

	@WebsocketHandlerMapping(value = 1749536939, name = "EditPeerFolders")
	public Api.Updates editPeerFolders(FoldersApi.EditPeerFolders editPeerFolders) {
		return null;
	}

	@WebsocketHandlerMapping(value = 472471681, name = "DeleteFolder")
	public Api.Updates deleteFolder(FoldersApi.DeleteFolder deleteFolder) {
		return null;
	}
}