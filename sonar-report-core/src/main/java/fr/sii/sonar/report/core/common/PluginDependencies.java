package fr.sii.sonar.report.core.common;

import org.sonar.api.BatchComponent;
import org.sonar.api.batch.BatchSide;
import org.sonar.api.batch.fs.FileSystem;
import org.sonar.api.component.ResourcePerspectives;
import org.sonar.api.config.Settings;
import org.sonar.api.rules.RuleFinder;
import org.sonar.batch.index.BatchComponentCache;
import org.sonar.batch.report.ReportPublisher;

/**
 * Class that just groups Sonar dependencies that are needed by plugins.
 * 
 * @author Aurélien Baudet
 *
 */
public class PluginDependencies implements BatchComponent {
	private final Settings settings;
	private final ResourcePerspectives resourcePerspective;
	private final RuleFinder ruleFinder;
	private final FileSystem filesystem;
	private final BatchComponentCache batchComponentCache;
	private final ReportPublisher reportPublisher;
	
	public PluginDependencies(Settings settings, ResourcePerspectives resourcePerspective, RuleFinder ruleFinder, FileSystem filesystem, BatchComponentCache batchComponentCache, ReportPublisher reportPublisher) {
		super();
		this.settings = settings;
		this.resourcePerspective = resourcePerspective;
		this.ruleFinder = ruleFinder;
		this.filesystem = filesystem;
		this.batchComponentCache = batchComponentCache;
		this.reportPublisher = reportPublisher;
	}

	public Settings getSettings() {
		return settings;
	}

	public ResourcePerspectives getResourcePerspective() {
		return resourcePerspective;
	}

	public RuleFinder getRuleFinder() {
		return ruleFinder;
	}

	public FileSystem getFilesystem() {
		return filesystem;
	}

	public BatchComponentCache getBatchComponentCache() {
		return batchComponentCache;
	}

	public ReportPublisher getReportPublisher() {
		return reportPublisher;
	}
}
