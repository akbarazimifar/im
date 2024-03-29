package com.im.api;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigInteger;

public class MessagesApi {

	public static class TypeDialogs {}
	public static class TypeMessages {}
	public static class TypeChats {}
	public static class TypeChatFull {}
	public static class TypeAffectedHistory {}
	public static class TypeDhConfig {}
	public static class TypeSentEncryptedMessage {}
	public static class TypeStickers {}
	public static class TypeAllStickers {}
	public static class TypeAffectedMessages {}
	public static class TypeStickerSet {}
	public static class TypeSavedGifs {}
	public static class TypeBotResults {}
	public static class TypeBotCallbackAnswer {}
	public static class TypeMessageEditData {}
	public static class TypePeerDialogs {}
	public static class TypeFeaturedStickers {}
	public static class TypeRecentStickers {}
	public static class TypeArchivedStickers {}
	public static class TypeStickerSetInstallResult {}
	public static class TypeHighScores {}
	public static class TypeFavedStickers {}
	public static class TypeFoundStickerSets {}
	public static class TypeSearchCounter {}
	public static class TypeInactiveChats {}
	public static class TypeVotesList {}
	public static class TypeMessageViews {}
	public static class TypeDiscussionMessage {}
	public static class TypeHistoryImport {}
	public static class TypeHistoryImportParsed {}
	public static class TypeAffectedFoundMessages {}
	public static class TypeExportedChatInvites {}
	public static class TypeExportedChatInvite {}
	public static class TypeChatInviteImporters {}
	public static class TypeChatAdminsWithInvites {}
	public static class TypeCheckedHistoryImportPeer {}
	public static class TypeSponsoredMessages {}
	public static class TypeSearchResultsCalendar {}
	public static class TypeSearchResultsPositions {}
	public static class TypePeerSettings {}
	public static class TypeMessageReactionsList {}
	public static class TypeAvailableReactions {}
	public static class TypeTranslatedText {}
	public static class TypeTranscribedAudio {}

	@Data
	public static class Dialogs {
		private Api.TypeDialog[] dialogs;
		private Api.TypeMessage[] messages;
		private Api.TypeChat[] chats;
		private Api.TypeUser[] users;
	}

	@Data
	public static class DialogsSlice {
		private int count;
		private Api.TypeDialog[] dialogs;
		private Api.TypeMessage[] messages;
		private Api.TypeChat[] chats;
		private Api.TypeUser[] users;
	}

	@Data
	public static class DialogsNotModified {
		private int count;
	}

	@Data
	public static class Messages {
		private Api.TypeMessage[] messages;
		private Api.TypeChat[] chats;
		private Api.TypeUser[] users;
	}

	@Data
	public static class MessagesSlice {
		private Api.True inexact;
		private int count;
		private int nextRate;
		private int offsetIdOffset;
		private Api.TypeMessage[] messages;
		private Api.TypeChat[] chats;
		private Api.TypeUser[] users;
	}

	@Data
	public static class ChannelMessages {
		private Api.True inexact;
		private int pts;
		private int count;
		private int offsetIdOffset;
		private Api.TypeMessage[] messages;
		private Api.TypeChat[] chats;
		private Api.TypeUser[] users;
	}

	@Data
	public static class MessagesNotModified {
		private int count;
	}

	@Data
	public static class Chats {
		private Api.TypeChat[] chats;
	}

	@Data
	public static class ChatsSlice {
		private int count;
		private Api.TypeChat[] chats;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class ChatFull extends Api.TypeChatFull {
		private Api.TypeChatFull fullChat;
		private Api.TypeChat[] chats;
		private Api.TypeUser[] users;
	}

	@Data
	public static class AffectedHistory {
		private int pts;
		private int ptsCount;
		private int offset;
	}

	@Data
	public static class DhConfigNotModified {
		private byte[] random;
	}

	@Data
	public static class DhConfig {
		private int g;
		private byte[] p;
		private int version;
		private byte[] random;
	}

	@Data
	public static class SentEncryptedMessage {
		private int date;
	}

	@Data
	public static class SentEncryptedFile {
		private int date;
		private Api.TypeEncryptedFile file;
	}

	@Data
	public static class StickersNotModified {
	}

	@Data
	public static class Stickers {
		private BigInteger hash;
		private Api.TypeDocument[] stickers;
	}

	@Data
	public static class AllStickersNotModified {
	}

	@Data
	public static class AllStickers {
		private BigInteger hash;
		private Api.TypeStickerSet[] sets;
	}

	@Data
	public static class AffectedMessages {
		private int pts;
		private int ptsCount;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class StickerSet extends Api.TypeStickerSet {
		private Api.TypeStickerSet set;
		private Api.TypeStickerPack[] packs;
		private Api.TypeDocument[] documents;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class StickerSetNotModified extends Api.TypeStickerSet {
	}

	@Data
	public static class SavedGifsNotModified {
	}

	@Data
	public static class SavedGifs {
		private BigInteger hash;
		private Api.TypeDocument[] gifs;
	}

	@Data
	public static class BotResults {
		private Api.True gallery;
		private BigInteger queryId;
		private String nextOffset;
		private Api.TypeInlineBotSwitchPM switchPm;
		private Api.TypeBotInlineResult[] results;
		private int cacheTime;
		private Api.TypeUser[] users;
	}

	@Data
	public static class BotCallbackAnswer {
		private Api.True alert;
		private Api.True hasUrl;
		private Api.True nativeUi;
		private String message;
		private String url;
		private int cacheTime;
	}

	@Data
	public static class MessageEditData {
		private Api.True caption;
	}

	@Data
	public static class PeerDialogs {
		private Api.TypeDialog[] dialogs;
		private Api.TypeMessage[] messages;
		private Api.TypeChat[] chats;
		private Api.TypeUser[] users;
		private UpdatesApi.TypeState state;
	}

	@Data
	public static class FeaturedStickersNotModified {
		private int count;
	}

	@Data
	public static class FeaturedStickers {
		private Api.True premium;
		private BigInteger hash;
		private int count;
		private Api.TypeStickerSetCovered[] sets;
		private BigInteger[] unread;
	}

	@Data
	public static class RecentStickersNotModified {
	}

	@Data
	public static class RecentStickers {
		private BigInteger hash;
		private Api.TypeStickerPack[] packs;
		private Api.TypeDocument[] stickers;
		private int[] dates;
	}

	@Data
	public static class ArchivedStickers {
		private int count;
		private Api.TypeStickerSetCovered[] sets;
	}

	@Data
	public static class StickerSetInstallResultSuccess {
	}

	@Data
	public static class StickerSetInstallResultArchive {
		private Api.TypeStickerSetCovered[] sets;
	}

	@Data
	public static class HighScores {
		private Api.TypeHighScore[] scores;
		private Api.TypeUser[] users;
	}

	@Data
	public static class FavedStickersNotModified {
	}

	@Data
	public static class FavedStickers {
		private BigInteger hash;
		private Api.TypeStickerPack[] packs;
		private Api.TypeDocument[] stickers;
	}

	@Data
	public static class FoundStickerSetsNotModified {
	}

	@Data
	public static class FoundStickerSets {
		private BigInteger hash;
		private Api.TypeStickerSetCovered[] sets;
	}

	@Data
	public static class SearchCounter {
		private Api.True inexact;
		private Api.TypeMessagesFilter filter;
		private int count;
	}

	@Data
	public static class InactiveChats {
		private int[] dates;
		private Api.TypeChat[] chats;
		private Api.TypeUser[] users;
	}

	@Data
	public static class VotesList {
		private int count;
		private Api.TypeMessageUserVote[] votes;
		private Api.TypeUser[] users;
		private String nextOffset;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class MessageViews extends Api.TypeMessageViews {
		private Api.TypeMessageViews[] views;
		private Api.TypeChat[] chats;
		private Api.TypeUser[] users;
	}

	@Data
	public static class DiscussionMessage {
		private Api.TypeMessage[] messages;
		private int maxId;
		private int readInboxMaxId;
		private int readOutboxMaxId;
		private int unreadCount;
		private Api.TypeChat[] chats;
		private Api.TypeUser[] users;
	}

	@Data
	public static class HistoryImport {
		private BigInteger id;
	}

	@Data
	public static class HistoryImportParsed {
		private Api.True pm;
		private Api.True group;
		private String title;
	}

	@Data
	public static class AffectedFoundMessages {
		private int pts;
		private int ptsCount;
		private int offset;
		private int[] messages;
	}

	@Data
	public static class ExportedChatInvites {
		private int count;
		private Api.TypeExportedChatInvite[] invites;
		private Api.TypeUser[] users;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class ExportedChatInvite extends Api.TypeExportedChatInvite {
		private Api.TypeExportedChatInvite invite;
		private Api.TypeUser[] users;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class ExportedChatInviteReplaced extends Api.TypeExportedChatInvite {
		private Api.TypeExportedChatInvite invite;
		private Api.TypeExportedChatInvite newInvite;
		private Api.TypeUser[] users;
	}

	@Data
	public static class ChatInviteImporters {
		private int count;
		private Api.TypeChatInviteImporter[] importers;
		private Api.TypeUser[] users;
	}

	@Data
	public static class ChatAdminsWithInvites {
		private Api.TypeChatAdminWithInvites[] admins;
		private Api.TypeUser[] users;
	}

	@Data
	public static class CheckedHistoryImportPeer {
		private String confirmText;
	}

	@Data
	public static class SponsoredMessages {
		private Api.TypeSponsoredMessage[] messages;
		private Api.TypeChat[] chats;
		private Api.TypeUser[] users;
	}

	@Data
	public static class SearchResultsCalendar {
		private Api.True inexact;
		private int count;
		private int minDate;
		private int minMsgId;
		private int offsetIdOffset;
		private Api.TypeSearchResultsCalendarPeriod[] periods;
		private Api.TypeMessage[] messages;
		private Api.TypeChat[] chats;
		private Api.TypeUser[] users;
	}

	@Data
	public static class SearchResultsPositions {
		private int count;
		private Api.TypeSearchResultsPosition[] positions;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class PeerSettings extends Api.TypePeerSettings {
		private Api.TypePeerSettings settings;
		private Api.TypeChat[] chats;
		private Api.TypeUser[] users;
	}

	@Data
	public static class MessageReactionsList {
		private int count;
		private Api.TypeMessagePeerReaction[] reactions;
		private Api.TypeChat[] chats;
		private Api.TypeUser[] users;
		private String nextOffset;
	}

	@Data
	public static class AvailableReactionsNotModified {
	}

	@Data
	public static class AvailableReactions {
		private int hash;
		private Api.TypeAvailableReaction[] reactions;
	}

	@Data
	public static class TranslateNoResult {
	}

	@Data
	public static class TranslateResultText {
		private String text;
	}

	@Data
	public static class TranscribedAudio {
		private Api.True pending;
		private BigInteger transcriptionId;
		private String text;
	}

	@Data
	public static class GetMessages {
		private Api.TypeInputMessage[] id;
	}

	@Data
	public static class GetDialogs {
		private Api.True excludePinned;
		private int folderId;
		private int offsetDate;
		private int offsetId;
		private Api.TypeInputPeer offsetPeer;
		private int limit;
		private BigInteger hash;
	}

	@Data
	public static class GetHistory {
		private Api.TypeInputPeer peer;
		private int offsetId;
		private int offsetDate;
		private int addOffset;
		private int limit;
		private int maxId;
		private int minId;
		private BigInteger hash;
	}

	@Data
	public static class Search {
		private Api.TypeInputPeer peer;
		private String q;
		private Api.TypeInputPeer fromId;
		private int topMsgId;
		private Api.TypeMessagesFilter filter;
		private int minDate;
		private int maxDate;
		private int offsetId;
		private int addOffset;
		private int limit;
		private int maxId;
		private int minId;
		private BigInteger hash;
	}

	@Data
	public static class ReadHistory {
		private Api.TypeInputPeer peer;
		private int maxId;
	}

	@Data
	public static class DeleteHistory {
		private Api.True justClear;
		private Api.True revoke;
		private Api.TypeInputPeer peer;
		private int maxId;
		private int minDate;
		private int maxDate;
	}

	@Data
	public static class DeleteMessages {
		private Api.True revoke;
		private int[] id;
	}

	@Data
	public static class ReceivedMessages {
		private int maxId;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class SetTyping extends Api.TypeBool {
		private Api.TypeInputPeer peer;
		private int topMsgId;
		private Api.TypeSendMessageAction action;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class SendMessage extends Api.TypeUpdates {
		private Api.True noWebpage;
		private Api.True silent;
		private Api.True background;
		private Api.True clearDraft;
		private Api.True noforwards;
		private Api.TypeInputPeer peer;
		private int replyToMsgId;
		private String message;
		private BigInteger randomId;
		private Api.TypeReplyMarkup replyMarkup;
		private Api.TypeMessageEntity[] entities;
		private int scheduleDate;
		private Api.TypeInputPeer sendAs;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class SendMedia extends Api.TypeUpdates {
		private Api.True silent;
		private Api.True background;
		private Api.True clearDraft;
		private Api.True noforwards;
		private Api.TypeInputPeer peer;
		private int replyToMsgId;
		private Api.TypeInputMedia media;
		private String message;
		private BigInteger randomId;
		private Api.TypeReplyMarkup replyMarkup;
		private Api.TypeMessageEntity[] entities;
		private int scheduleDate;
		private Api.TypeInputPeer sendAs;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class ForwardMessages extends Api.TypeUpdates {
		private Api.True silent;
		private Api.True background;
		private Api.True withMyScore;
		private Api.True dropAuthor;
		private Api.True dropMediaCaptions;
		private Api.True noforwards;
		private Api.TypeInputPeer fromPeer;
		private int[] id;
		private BigInteger[] randomId;
		private Api.TypeInputPeer toPeer;
		private int scheduleDate;
		private Api.TypeInputPeer sendAs;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class ReportSpam extends Api.TypeBool {
		private Api.TypeInputPeer peer;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class GetPeerSettings extends Api.TypePeerSettings {
		private Api.TypeInputPeer peer;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class Report extends Api.TypeBool {
		private Api.TypeInputPeer peer;
		private int[] id;
		private Api.TypeReportReason reason;
		private String message;
	}

	@Data
	public static class GetChats {
		private BigInteger[] id;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class GetFullChat extends Api.TypeChatFull {
		private BigInteger chatId;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class EditChatTitle extends Api.TypeUpdates {
		private BigInteger chatId;
		private String title;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class EditChatPhoto extends Api.TypeUpdates {
		private BigInteger chatId;
		private Api.TypeInputChatPhoto photo;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class AddChatUser extends Api.TypeUpdates {
		private BigInteger chatId;
		private Api.TypeInputUser userId;
		private int fwdLimit;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class DeleteChatUser extends Api.TypeUpdates {
		private Api.True revokeHistory;
		private BigInteger chatId;
		private Api.TypeInputUser userId;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class CreateChat extends Api.TypeUpdates {
		private Api.TypeInputUser[] users;
		private String title;
	}

	@Data
	public static class GetDhConfig {
		private int version;
		private int randomLength;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class RequestEncryption extends Api.TypeEncryptedChat {
		private Api.TypeInputUser userId;
		private int randomId;
		private byte[] gA;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class AcceptEncryption extends Api.TypeEncryptedChat {
		private Api.TypeInputEncryptedChat peer;
		private byte[] gB;
		private BigInteger keyFingerprint;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class DiscardEncryption extends Api.TypeBool {
		private Api.True deleteHistory;
		private int chatId;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class SetEncryptedTyping extends Api.TypeBool {
		private Api.TypeInputEncryptedChat peer;
		private Boolean typing;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class ReadEncryptedHistory extends Api.TypeBool {
		private Api.TypeInputEncryptedChat peer;
		private int maxDate;
	}

	@Data
	public static class SendEncrypted {
		private Api.True silent;
		private Api.TypeInputEncryptedChat peer;
		private BigInteger randomId;
		private byte[] data;
	}

	@Data
	public static class SendEncryptedFile {
		private Api.True silent;
		private Api.TypeInputEncryptedChat peer;
		private BigInteger randomId;
		private byte[] data;
		private Api.TypeInputEncryptedFile file;
	}

	@Data
	public static class SendEncryptedService {
		private Api.TypeInputEncryptedChat peer;
		private BigInteger randomId;
		private byte[] data;
	}

	@Data
	public static class ReceivedQueue {
		private int maxQts;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class ReportEncryptedSpam extends Api.TypeBool {
		private Api.TypeInputEncryptedChat peer;
	}

	@Data
	public static class ReadMessageContents {
		private int[] id;
	}

	@Data
	public static class GetStickers {
		private String emoticon;
		private BigInteger hash;
	}

	@Data
	public static class GetAllStickers {
		private BigInteger hash;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class GetWebPagePreview extends Api.TypeMessageMedia {
		private String message;
		private Api.TypeMessageEntity[] entities;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class ExportChatInvite extends Api.TypeExportedChatInvite {
		private Api.True legacyRevokePermanent;
		private Api.True requestNeeded;
		private Api.TypeInputPeer peer;
		private int expireDate;
		private int usageLimit;
		private String title;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class CheckChatInvite extends Api.TypeChatInvite {
		private String hash;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class ImportChatInvite extends Api.TypeUpdates {
		private String hash;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class GetStickerSet extends Api.TypeStickerSet {
		private Api.TypeInputStickerSet stickerset;
		private int hash;
	}

	@Data
	public static class InstallStickerSet {
		private Api.TypeInputStickerSet stickerset;
		private Boolean archived;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class UninstallStickerSet extends Api.TypeBool {
		private Api.TypeInputStickerSet stickerset;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class StartBot extends Api.TypeUpdates {
		private Api.TypeInputUser bot;
		private Api.TypeInputPeer peer;
		private BigInteger randomId;
		private String startParam;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class GetMessagesViews extends Api.TypeMessageViews {
		private Api.TypeInputPeer peer;
		private int[] id;
		private Boolean increment;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class EditChatAdmin extends Api.TypeBool {
		private BigInteger chatId;
		private Api.TypeInputUser userId;
		private Boolean isAdmin;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class MigrateChat extends Api.TypeUpdates {
		private BigInteger chatId;
	}

	@Data
	public static class SearchGlobal {
		private int folderId;
		private String q;
		private Api.TypeMessagesFilter filter;
		private int minDate;
		private int maxDate;
		private int offsetRate;
		private Api.TypeInputPeer offsetPeer;
		private int offsetId;
		private int limit;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class ReorderStickerSets extends Api.TypeBool {
		private Api.True masks;
		private BigInteger[] order;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class GetDocumentByHash extends Api.TypeDocument {
		private byte[] sha256;
		private BigInteger size;
		private String mimeType;
	}

	@Data
	public static class GetSavedGifs {
		private BigInteger hash;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class SaveGif extends Api.TypeBool {
		private Api.TypeInputDocument id;
		private Boolean unsave;
	}

	@Data
	public static class GetInlineBotResults {
		private Api.TypeInputUser bot;
		private Api.TypeInputPeer peer;
		private Api.TypeInputGeoPoint geoPoint;
		private String query;
		private String offset;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class SetInlineBotResults extends Api.TypeBool {
		private Api.True gallery;
		private Api.True privateSuffix;
		private BigInteger queryId;
		private Api.TypeInputBotInlineResult[] results;
		private int cacheTime;
		private String nextOffset;
		private Api.TypeInlineBotSwitchPM switchPm;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class SendInlineBotResult extends Api.TypeUpdates {
		private Api.True silent;
		private Api.True background;
		private Api.True clearDraft;
		private Api.True hideVia;
		private Api.TypeInputPeer peer;
		private int replyToMsgId;
		private BigInteger randomId;
		private BigInteger queryId;
		private String id;
		private int scheduleDate;
		private Api.TypeInputPeer sendAs;
	}

	@Data
	public static class GetMessageEditData {
		private Api.TypeInputPeer peer;
		private int id;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class EditMessage extends Api.TypeUpdates {
		private Api.True noWebpage;
		private Api.TypeInputPeer peer;
		private int id;
		private String message;
		private Api.TypeInputMedia media;
		private Api.TypeReplyMarkup replyMarkup;
		private Api.TypeMessageEntity[] entities;
		private int scheduleDate;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class EditInlineBotMessage extends Api.TypeBool {
		private Api.True noWebpage;
		private Api.TypeInputBotInlineMessageID id;
		private String message;
		private Api.TypeInputMedia media;
		private Api.TypeReplyMarkup replyMarkup;
		private Api.TypeMessageEntity[] entities;
	}

	@Data
	public static class GetBotCallbackAnswer {
		private Api.True game;
		private Api.TypeInputPeer peer;
		private int msgId;
		private byte[] data;
		private Api.TypeInputCheckPasswordSRP password;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class SetBotCallbackAnswer extends Api.TypeBool {
		private Api.True alert;
		private BigInteger queryId;
		private String message;
		private String url;
		private int cacheTime;
	}

	@Data
	public static class GetPeerDialogs {
		private Api.TypeInputDialogPeer[] peers;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class SaveDraft extends Api.TypeBool {
		private Api.True noWebpage;
		private int replyToMsgId;
		private Api.TypeInputPeer peer;
		private String message;
		private Api.TypeMessageEntity[] entities;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class GetAllDrafts extends Api.TypeUpdates {
	}

	@Data
	public static class GetFeaturedStickers {
		private BigInteger hash;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class ReadFeaturedStickers extends Api.TypeBool {
		private BigInteger[] id;
	}

	@Data
	public static class GetRecentStickers {
		private Api.True attached;
		private BigInteger hash;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class SaveRecentSticker extends Api.TypeBool {
		private Api.True attached;
		private Api.TypeInputDocument id;
		private Boolean unsave;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class ClearRecentStickers extends Api.TypeBool {
		private Api.True attached;
	}

	@Data
	public static class GetArchivedStickers {
		private Api.True masks;
		private BigInteger offsetId;
		private int limit;
	}

	@Data
	public static class GetMaskStickers {
		private BigInteger hash;
	}

	@Data
	public static class GetAttachedStickers {
		private Api.TypeInputStickeredMedia media;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class SetGameScore extends Api.TypeUpdates {
		private Api.True editMessage;
		private Api.True force;
		private Api.TypeInputPeer peer;
		private int id;
		private Api.TypeInputUser userId;
		private int score;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class SetInlineGameScore extends Api.TypeBool {
		private Api.True editMessage;
		private Api.True force;
		private Api.TypeInputBotInlineMessageID id;
		private Api.TypeInputUser userId;
		private int score;
	}

	@Data
	public static class GetGameHighScores {
		private Api.TypeInputPeer peer;
		private int id;
		private Api.TypeInputUser userId;
	}

	@Data
	public static class GetInlineGameHighScores {
		private Api.TypeInputBotInlineMessageID id;
		private Api.TypeInputUser userId;
	}

	@Data
	public static class GetCommonChats {
		private Api.TypeInputUser userId;
		private BigInteger maxId;
		private int limit;
	}

	@Data
	public static class GetAllChats {
		private BigInteger[] exceptIds;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class GetWebPage extends Api.TypeWebPage {
		private String url;
		private int hash;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class ToggleDialogPin extends Api.TypeBool {
		private Api.True pinned;
		private Api.TypeInputDialogPeer peer;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class ReorderPinnedDialogs extends Api.TypeBool {
		private Api.True force;
		private int folderId;
		private Api.TypeInputDialogPeer[] order;
	}

	@Data
	public static class GetPinnedDialogs {
		private int folderId;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class SetBotShippingResults extends Api.TypeBool {
		private BigInteger queryId;
		private String error;
		private Api.TypeShippingOption[] shippingOptions;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class SetBotPrecheckoutResults extends Api.TypeBool {
		private Api.True success;
		private BigInteger queryId;
		private String error;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class UploadMedia extends Api.TypeMessageMedia {
		private Api.TypeInputPeer peer;
		private Api.TypeInputMedia media;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class SendScreenshotNotification extends Api.TypeUpdates {
		private Api.TypeInputPeer peer;
		private int replyToMsgId;
		private BigInteger randomId;
	}

	@Data
	public static class GetFavedStickers {
		private BigInteger hash;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class FaveSticker extends Api.TypeBool {
		private Api.TypeInputDocument id;
		private Boolean unfave;
	}

	@Data
	public static class GetUnreadMentions {
		private Api.TypeInputPeer peer;
		private int offsetId;
		private int addOffset;
		private int limit;
		private int maxId;
		private int minId;
	}

	@Data
	public static class ReadMentions {
		private Api.TypeInputPeer peer;
	}

	@Data
	public static class GetRecentLocations {
		private Api.TypeInputPeer peer;
		private int limit;
		private BigInteger hash;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class SendMultiMedia extends Api.TypeUpdates {
		private Api.True silent;
		private Api.True background;
		private Api.True clearDraft;
		private Api.True noforwards;
		private Api.TypeInputPeer peer;
		private int replyToMsgId;
		private Api.TypeInputSingleMedia[] multiMedia;
		private int scheduleDate;
		private Api.TypeInputPeer sendAs;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class UploadEncryptedFile extends Api.TypeEncryptedFile {
		private Api.TypeInputEncryptedChat peer;
		private Api.TypeInputEncryptedFile file;
	}

	@Data
	public static class SearchStickerSets {
		private Api.True excludeFeatured;
		private String q;
		private BigInteger hash;
	}

	@Data
	public static class GetSplitRanges {
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class MarkDialogUnread extends Api.TypeBool {
		private Api.True unread;
		private Api.TypeInputDialogPeer peer;
	}

	@Data
	public static class GetDialogUnreadMarks {
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class ClearAllDrafts extends Api.TypeBool {
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class UpdatePinnedMessage extends Api.TypeUpdates {
		private Api.True silent;
		private Api.True unpin;
		private Api.True pmOneside;
		private Api.TypeInputPeer peer;
		private int id;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class SendVote extends Api.TypeUpdates {
		private Api.TypeInputPeer peer;
		private int msgId;
		private byte[][] options;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class GetPollResults extends Api.TypeUpdates {
		private Api.TypeInputPeer peer;
		private int msgId;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class GetOnlines extends Api.TypeChatOnlines {
		private Api.TypeInputPeer peer;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class EditChatAbout extends Api.TypeBool {
		private Api.TypeInputPeer peer;
		private String about;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class EditChatDefaultBannedRights extends Api.TypeUpdates {
		private Api.TypeInputPeer peer;
		private Api.TypeChatBannedRights bannedRights;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class GetEmojiKeywords extends Api.TypeEmojiKeywordsDifference {
		private String langCode;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class GetEmojiKeywordsDifference extends Api.TypeEmojiKeywordsDifference {
		private String langCode;
		private int fromVersion;
	}

	@Data
	public static class GetEmojiKeywordsLanguages {
		private String[] langCodes;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class GetEmojiURL extends Api.TypeEmojiURL {
		private String langCode;
	}

	@Data
	public static class GetSearchCounters {
		private Api.TypeInputPeer peer;
		private Api.TypeMessagesFilter[] filters;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class RequestUrlAuth extends Api.TypeUrlAuthResult {
		private Api.TypeInputPeer peer;
		private int msgId;
		private int buttonId;
		private String url;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class AcceptUrlAuth extends Api.TypeUrlAuthResult {
		private Api.True writeAllowed;
		private Api.TypeInputPeer peer;
		private int msgId;
		private int buttonId;
		private String url;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class HidePeerSettingsBar extends Api.TypeBool {
		private Api.TypeInputPeer peer;
	}

	@Data
	public static class GetScheduledHistory {
		private Api.TypeInputPeer peer;
		private BigInteger hash;
	}

	@Data
	public static class GetScheduledMessages {
		private Api.TypeInputPeer peer;
		private int[] id;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class SendScheduledMessages extends Api.TypeUpdates {
		private Api.TypeInputPeer peer;
		private int[] id;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class DeleteScheduledMessages extends Api.TypeUpdates {
		private Api.TypeInputPeer peer;
		private int[] id;
	}

	@Data
	public static class GetPollVotes {
		private Api.TypeInputPeer peer;
		private int id;
		private byte[] option;
		private String offset;
		private int limit;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class ToggleStickerSets extends Api.TypeBool {
		private Api.True uninstall;
		private Api.True archive;
		private Api.True unarchive;
		private Api.TypeInputStickerSet[] stickersets;
	}

	@Data
	public static class GetDialogFilters {
	}

	@Data
	public static class GetSuggestedDialogFilters {
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class UpdateDialogFilter extends Api.TypeBool {
		private int id;
		private Api.TypeDialogFilter filter;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class UpdateDialogFiltersOrder extends Api.TypeBool {
		private int[] order;
	}

	@Data
	public static class GetOldFeaturedStickers {
		private int offset;
		private int limit;
		private BigInteger hash;
	}

	@Data
	public static class GetReplies {
		private Api.TypeInputPeer peer;
		private int msgId;
		private int offsetId;
		private int offsetDate;
		private int addOffset;
		private int limit;
		private int maxId;
		private int minId;
		private BigInteger hash;
	}

	@Data
	public static class GetDiscussionMessage {
		private Api.TypeInputPeer peer;
		private int msgId;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class ReadDiscussion extends Api.TypeBool {
		private Api.TypeInputPeer peer;
		private int msgId;
		private int readMaxId;
	}

	@Data
	public static class UnpinAllMessages {
		private Api.TypeInputPeer peer;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class DeleteChat extends Api.TypeBool {
		private BigInteger chatId;
	}

	@Data
	public static class DeletePhoneCallHistory {
		private Api.True revoke;
	}

	@Data
	public static class CheckHistoryImport {
		private String importHead;
	}

	@Data
	public static class InitHistoryImport {
		private Api.TypeInputPeer peer;
		private Api.TypeInputFile file;
		private int mediaCount;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class UploadImportedMedia extends Api.TypeMessageMedia {
		private Api.TypeInputPeer peer;
		private BigInteger importId;
		private String fileName;
		private Api.TypeInputMedia media;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class StartHistoryImport extends Api.TypeBool {
		private Api.TypeInputPeer peer;
		private BigInteger importId;
	}

	@Data
	public static class GetExportedChatInvites {
		private Api.True revoked;
		private Api.TypeInputPeer peer;
		private Api.TypeInputUser adminId;
		private int offsetDate;
		private String offsetLink;
		private int limit;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class GetExportedChatInvite extends Api.TypeExportedChatInvite {
		private Api.TypeInputPeer peer;
		private String link;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class EditExportedChatInvite extends Api.TypeExportedChatInvite {
		private Api.True revoked;
		private Api.TypeInputPeer peer;
		private String link;
		private int expireDate;
		private int usageLimit;
		private Boolean requestNeeded;
		private String title;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class DeleteRevokedExportedChatInvites extends Api.TypeBool {
		private Api.TypeInputPeer peer;
		private Api.TypeInputUser adminId;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class DeleteExportedChatInvite extends Api.TypeBool {
		private Api.TypeInputPeer peer;
		private String link;
	}

	@Data
	public static class GetAdminsWithInvites {
		private Api.TypeInputPeer peer;
	}

	@Data
	public static class GetChatInviteImporters {
		private Api.True requested;
		private Api.TypeInputPeer peer;
		private String link;
		private String q;
		private int offsetDate;
		private Api.TypeInputUser offsetUser;
		private int limit;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class SetHistoryTTL extends Api.TypeUpdates {
		private Api.TypeInputPeer peer;
		private int period;
	}

	@Data
	public static class CheckHistoryImportPeer {
		private Api.TypeInputPeer peer;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class SetChatTheme extends Api.TypeUpdates {
		private Api.TypeInputPeer peer;
		private String emoticon;
	}

	@Data
	public static class GetMessageReadParticipants {
		private Api.TypeInputPeer peer;
		private int msgId;
	}

	@Data
	public static class GetSearchResultsCalendar {
		private Api.TypeInputPeer peer;
		private Api.TypeMessagesFilter filter;
		private int offsetId;
		private int offsetDate;
	}

	@Data
	public static class GetSearchResultsPositions {
		private Api.TypeInputPeer peer;
		private Api.TypeMessagesFilter filter;
		private int offsetId;
		private int limit;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class HideChatJoinRequest extends Api.TypeUpdates {
		private Api.True approved;
		private Api.TypeInputPeer peer;
		private Api.TypeInputUser userId;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class HideAllChatJoinRequests extends Api.TypeUpdates {
		private Api.True approved;
		private Api.TypeInputPeer peer;
		private String link;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class ToggleNoForwards extends Api.TypeUpdates {
		private Api.TypeInputPeer peer;
		private Boolean enabled;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class SaveDefaultSendAs extends Api.TypeBool {
		private Api.TypeInputPeer peer;
		private Api.TypeInputPeer sendAs;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class SendReaction extends Api.TypeUpdates {
		private Api.True big;
		private Api.TypeInputPeer peer;
		private int msgId;
		private String reaction;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class GetMessagesReactions extends Api.TypeUpdates {
		private Api.TypeInputPeer peer;
		private int[] id;
	}

	@Data
	public static class GetMessageReactionsList {
		private Api.TypeInputPeer peer;
		private int id;
		private String reaction;
		private String offset;
		private int limit;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class SetChatAvailableReactions extends Api.TypeUpdates {
		private Api.TypeInputPeer peer;
		private String[] availableReactions;
	}

	@Data
	public static class GetAvailableReactions {
		private int hash;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class SetDefaultReaction extends Api.TypeBool {
		private String reaction;
	}

	@Data
	public static class TranslateText {
		private Api.TypeInputPeer peer;
		private int msgId;
		private String text;
		private String fromLang;
		private String toLang;
	}

	@Data
	public static class GetUnreadReactions {
		private Api.TypeInputPeer peer;
		private int offsetId;
		private int addOffset;
		private int limit;
		private int maxId;
		private int minId;
	}

	@Data
	public static class ReadReactions {
		private Api.TypeInputPeer peer;
	}

	@Data
	public static class SearchSentMedia {
		private String q;
		private Api.TypeMessagesFilter filter;
		private int limit;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class GetAttachMenuBots extends Api.TypeAttachMenuBots {
		private BigInteger hash;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class GetAttachMenuBot extends Api.TypeAttachMenuBotsBot {
		private Api.TypeInputUser bot;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class ToggleBotInAttachMenu extends Api.TypeBool {
		private Api.TypeInputUser bot;
		private Boolean enabled;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class RequestWebView extends Api.TypeWebViewResult {
		private Api.True fromBotMenu;
		private Api.True silent;
		private Api.TypeInputPeer peer;
		private Api.TypeInputUser bot;
		private String url;
		private String startParam;
		private Api.TypeDataJSON themeParams;
		private int replyToMsgId;
		private Api.TypeInputPeer sendAs;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class ProlongWebView extends Api.TypeBool {
		private Api.True silent;
		private Api.TypeInputPeer peer;
		private Api.TypeInputUser bot;
		private BigInteger queryId;
		private int replyToMsgId;
		private Api.TypeInputPeer sendAs;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class RequestSimpleWebView extends Api.TypeSimpleWebViewResult {
		private Api.TypeInputUser bot;
		private String url;
		private Api.TypeDataJSON themeParams;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class SendWebViewResultMessage extends Api.TypeWebViewMessageSent {
		private String botQueryId;
		private Api.TypeInputBotInlineResult result;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class SendWebViewData extends Api.TypeUpdates {
		private Api.TypeInputUser bot;
		private BigInteger randomId;
		private String buttonText;
		private String data;
	}

	@Data
	public static class TranscribeAudio {
		private Api.TypeInputPeer peer;
		private int msgId;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class RateTranscribedAudio extends Api.TypeBool {
		private Api.TypeInputPeer peer;
		private int msgId;
		private BigInteger transcriptionId;
		private Boolean good;
	}
}