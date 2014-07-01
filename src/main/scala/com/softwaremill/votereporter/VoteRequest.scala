package com.softwaremill.votereporter

import org.joda.time.DateTime

case class VoteRequest(voteId: String, deviceKey: String, positive: Boolean, castedAt: DateTime)

case class PartialVoteRequest(positive: Boolean, castedAt: DateTime)
