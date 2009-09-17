
	/**
	 * Fetch <pkType> which references this <type>. Will return null in case reference is invalid.
	 *
	 * @param PDO $db a PDO Database instance
	 * @param array $sort array of DSC instances
	 * @return <pkType>
	 */
	public function fetch<pkType>(PDO $db, $sort=null) {
		$filter=array(<pkType>::<pkFieldConst>=>$this-><fkGetter>);
		$result=<pkType>::findByFilter($db, $filter, true, $sort);
		return empty($result) ? null : $result[0];
	}
